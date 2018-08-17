package dubbo;

/**
 * @author guanshaojuan
 * @ClassName OutClass
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018-08-17 16:03
 */
public class OuterClass {
    private String name;
    public OuterClass(String name){
        this.name = name;
    }
    class InnerClass {
        private String company;

        public InnerClass(String company) {
            this.company = company;
        }
        public void getCompany(){
            System.out.println(name+"在"+company+"公司上班");
        }
    }
    public void getInner(String string){
        InnerClass innerClass = new InnerClass(string);
        innerClass.getCompany();
    }

    public InnerClass getInnerClass(String company){
        return new InnerClass(company);
    }
    public static void main(String[] args){

        OuterClass outerClass = new OuterClass("guanguan");
        //outerClass.getInner("bsb");
        OuterClass.InnerClass innerClass = outerClass.getInnerClass("bsb");
        innerClass.getCompany();

        //System.out.println(company);
    }
}
