package company;

public class Sales1 extends Employee{
    //コンストラクター
    public Sales1(String name, Department department, String position, int employeeId) {
        super(name, department, position, employeeId);
    }
    
    //会議に参加するメソッド
    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("→営業として、上記の会議に参加します。部署：" + department.getName() + "名前:" + name);
    }

}
