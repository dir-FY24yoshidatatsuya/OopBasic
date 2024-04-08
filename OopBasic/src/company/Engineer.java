package company;

public class Engineer extends Employee {
    String programmingLanguage;
    
    public Engineer(String name, Department department, String position,
            int enployeeId, String programmingLanguage) {
        super(name, department, position, enployeeId);
        this.programmingLanguage = programmingLanguage;
        
    }
    
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。名前：" + name + 
                "、プログラミング言語：" + programmingLanguage);
    }
    
    //会議に参加するメソッドをオーバーライド
    @Override
    public void joinMeeting() {
        super.joinMeeting();
        System.out.println("→技術的な準備を行う、上記の会議に参加します。"
                + "名前：" + name);
    }
}