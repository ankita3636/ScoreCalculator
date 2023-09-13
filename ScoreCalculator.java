// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    import java.util.Scanner;
    class ScoreCalculator
    {
        public static void main(String[] args)
        {
            int[] scores=new int[5];
            int totalMatches=0,i=0;
            int totalScore=0;
             float average;
            Scanner input= new Scanner(System.in);
            System.out.println("Give the scores of matches below.\n Enter a negative value when you want to stop");
            for(i=0;i<5;i++)
            {
                System.out.println("Enter scores of match "+(i+1));
                scores[i]=input.nextInt();
                if(scores[i]<0) {
                    break;
                }
            }
            totalMatches = i;
            System.out.println("Total number of matches played- "+totalMatches);
            for(i=0;i<totalMatches;i++)
            {
                totalScore=totalScore+scores[i];
            }
            System.out.println("Total score of all matches- "+totalScore);
            average=(float)totalScore/totalMatches;
            System.out.println("Average score per match- "+average);


        }
    }
