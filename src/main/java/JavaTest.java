/*
public class JavaTest {
    public String getName(){
        return null;
    }

    public static void main(String[] args) {
//        KotlinClass kc = new KotlinClass("jack");
//        kc.show();

        //匿名对象
        loadData(new HttpReqImpl());

        //匿名内部类
        loadData(new HttpReq() {
            @Override
            public void onSuccess() {
                System.out.println("下载成功！");
            }
        });

        loadData(() -> System.out.println("下载成功！"));
    }

    public static void loadData(HttpReq req){
        req.onSuccess();
    }

    interface HttpReq{
        void onSuccess();
    }

    static class HttpReqImpl implements HttpReq{
        @Override
        public void onSuccess() {
            System.out.println("下载成功！");
        }
    }
}

class Test{
    private String name;
    public Test(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name is "+name);
    }
}

*/