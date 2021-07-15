/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] data = {3,1,2,7,5};
        /*
        * 問2
        * 以下のfor文を完成させなさい
        */

        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
            //配列の中身を１つずつ繰り返し表示している。
            //[i]には最初０が入っていて、繰り返される度に、１つずつ増えていき中身を取り出せる。
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            for (int j = data.length-1; j > i; j--) {
                

                //jが5、j-1が左側の7を表してて、
                if(data[j-1] > data[j]){  //左側の方が大きければ
                  int box = data[j];  //左側をいったんboxに保管
                  data[j] = data[j-1];
                  data[j-1] = box; //代入
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}       //上記コードで配列の中身を入れ替えている。
        //１つ目のfor文で配列の要素分繰り返している。
        //２つ目のfor文で要素を比べるための繰り返しをしている。
        //値と隣合わせの値を比較し入れ替えていく
        //入れ替えが行われなくなるまで繰り返している。
        //小さい順に並べ替えている。