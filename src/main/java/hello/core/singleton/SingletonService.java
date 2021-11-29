package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 하나만 생성
    private static final SingletonService instance = new SingletonService();

    // 2. 객체 인스턴스가 필요하다면 본 static 메서드 사용하여 조회
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {}

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
