public class Test {
    public static void main(String[] args){
        //ここが起点
        User a = new User();
        a.setId(2);
        a.setName("B");
        a.setAge(28);
        //System.out.println(a.getId()+":"+a.getName()+":"+a.getAge());
        a.print();
        
        User c = new User();
        c.setId(5);
        c.setName("C");
        c.setAge(30);
        //System.out.println(c.getId()+":"+c.getName()+":"+c.getAge());
        c.print();
    }
}

class User {
    private int id;
    private String name;
    private int age;
    //ここは領域作成。ここからインスタンスを作成する必要あり
    //privateでカプセル化で他からは触れない
    //private使用時はメソッド作成して逃がす
    
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

//newを作成したことで中に彫り込める

