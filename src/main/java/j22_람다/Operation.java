package j22_람다;

@FunctionalInterface // 람다를 사용할려면 이 어노테이션 달아줘야한다 왜? 추상메소드를 2개 이상 쓸 수 없도록 방지해준다
public interface Operation {
    public int calc(int x, int y);

    public default String resultToString(int result){ // 람다에서 default 는 하나 더 사용가능
        return "결과: " + result;
    }

}
