package BlackJack;

import java.util.ArrayList;

/**
 * @author Hojorno Giovanna
 */

/**
 *ヒューマンクラス
 */
abstract class Human {
    
    protected ArrayList<Integer> myCards = new ArrayList<Integer>(); //山札
    public abstract void setCard(ArrayList<Integer> set); // カードを手札に追加
    public abstract boolean checkSum(); //カードを引くか判定
    public abstract int open(); //カードの合計値
    public abstract void print(); //コンソールに出力
}
