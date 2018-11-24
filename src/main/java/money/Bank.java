package money;

public class Bank {

    /**
     * 為替変換結果を取得する
     * @param to 為替単位
     * @return 計算結果
     */
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }

}
