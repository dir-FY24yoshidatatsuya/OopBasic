package company;

public class ObjectSample {

    public static void main(String[] args) {
        //インスタンスの作成
        var sales1Department = new Department("営業部","xx", 100000);
        Employee sales1 = new Sales1("鈴木", sales1Department,"課長", 100);
        
        //インスタンスメソッドの呼び出し
        sales1.report();
        sales1.report(2);
        sales1.joinMeeting();
        
        //一行空ける
        System.out.println("");
        
        //インスタンスの作成
        var devDepartment = new Department("開発部","yy", 0);
        var engineer = new Engineer("田中", devDepartment,"一般社員", 88, "Java");
        
        //インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        //一行空ける
        System.out.println("");
        
        //ポリモーフィズムの確認
        Engineer projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        //インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Employee) {
            //developSoftwareメソッドを呼び出す
            ((Engineer) projectManager).developSoftware();
        }
        
        //一行空ける
        System.out.println("");
        
        //アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", sales1Department);
        
        ((Workable) sales1).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
    }

}