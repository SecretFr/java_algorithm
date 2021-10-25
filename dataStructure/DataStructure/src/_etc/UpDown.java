package _etc;

// 이해하기 쉽게 한글로^^;
class 해장국 {
    public void 간맞추기() {
        // 뭐든...
        System.out.println("일반 해장국");
    }
}

class 뼈해장국 extends 해장국 {
    @Override 
    public void 간맞추기() {
        // 뼈해장국에는 들깨가루...
        System.out.println("빼 해장국");
    }
}

class 콩나물해장국 extends 해장국 {
    @Override 
    public void 간맞추기() {
        // 콩나물 해장국에는 고춧가루...
        System.out.println("쾽나물 해장국");
    }
}

class 취객 {
    public void 해장국먹기(해장국 어떤해장국) {
        어떤해장국.간맞추기();
    }
}

public class UpDown {
    public static void main(String[] args){
        취객 취객1 = new 취객();
        해장국 해장국한그릇 = new 뼈해장국();
        취객1.해장국먹기(해장국한그릇);
    }
}
