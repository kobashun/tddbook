package money;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Pair, Integer> rates = new HashMap<>();

    /**
     * 為替変換結果を取得する
     *
     * @param to 為替単位
     * @return 計算結果
     */
    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return rates.get(new Pair(from, to));
    }
}
