public class Test {
    public static void main(String[] args){
        User[] a = new User[5];

        a[0] = new User();
        a[0].setId(1);
        a[0].setName("A");
        a[0].setAge(20);
        a[0].print();
        
        a[1] = new User();
        a[1].setId(2);
        a[1].setName("B");
        a[1].setAge(22);
        a[1].print();
    }
}
class User {
    private int id;
    private String name;
    private int age;
    
    User(){
        id = 0;
        name = "";
        age = 0;
    //ここがコンストラクタ
    //コンストラクタに関しては自動的に生成される new Userの箇所でコンストラクタの呼び出し    }
    
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void print(){
        System.out.println(id+":"+name+":"+age);
    }
}
//クラス内には変数・メソッドが入るが特殊なものがある
//コンストラクタが代表例