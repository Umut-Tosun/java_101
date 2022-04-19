package Diziler;

public class CokBoyutluDiziler {
    public static void main(String[] args) {
        /*int [][] matris = new int[6][6];
        int [][] uzaklik={
            {0, 453, 939, 243, 783, 891},
            {453, 0, 490, 384, 620, 439},
            {939, 490, 0, 839, 863, 423},
            {243, 384, 839, 0, 544, 823},
            {783, 620, 863, 544, 0, 1045},
            {891, 439, 423, 823, 1045, 0}
        };
        matris[0][0]=0;
        matris[2][3]=839;

        System.out.println(uzaklik[4][2]);*/


        String [][] matris=new String[4][3];
        int number=1;
        int j=0,i=0;

        for (i=0;i<matris.length;i++)
        {
            for ( j=0;j<matris[i].length;j++)
            {
                matris[i][j]="~";
                number++;
            }
        }
        for ( i=0;i<matris.length;i++)
        {
            for ( j=0;j<matris[i].length;j++)
            {
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
