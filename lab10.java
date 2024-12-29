import java.lang.Thread;
class A extends Thread {
public void run(){
    for (int i=1;i<5;i++){
        System.out.println("From class a thred A:i="+i);
    }
    System.out.println("Exit from A");
 }
}

class B extends Thread {
    public void run(){
    for (int i=1;i<5;i++){
        System.out.println("From class a thred B:i="+i);
    }
    System.out.println("Exit from B");
}
}

class C extends Thread {
    public void run(){
    for (int i=1;i<5;i++){
        System.out.println("From class a thred C:i="+i);
    }
    System.out.println("Exit from C");
}
}
public class lab10 {
    public static void main(String[] args) {
 new A().start();
 new B().start();
 new C().start();
 }
}