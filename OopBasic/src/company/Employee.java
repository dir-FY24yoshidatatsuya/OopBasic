package company;

public class Employee {
    //フィールド
    String name;
    String department;
    String position;
    int employeeId;
    
    //コンストラクター
    public Employee(String name, String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
        
    }
    
    //報告メソッド(オーバーロード)
    public void report(int times) {
        System.out.println(times + "回目の報告をします。役職：" + position + "、名前：" + name);
    }
    
    //報告メソッド
    public void report() {
        report(1);
    }

}
