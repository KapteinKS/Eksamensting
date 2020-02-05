public class Oppgave1 {
    public static void main(String[] args){
        int[] heltall = {43, 22, -33, 4, -5, 64, -7, 82, -94};

        System.out.println(heltall[2] + " " + heltall[5]);

        int total = 0;

        for(int i = 0; i < heltall.length; i++){
            total += heltall[i];
        }

        int gjennomsnitt = total/heltall.length;

        int total2 = 0, antallOver9 = 0;

        for(int i = 0; i < heltall.length; i++){
            if(heltall[i] < 9){
                total2 += heltall[i];
                antallOver9++;
            }
        }

        int gjennomsnitt2 = total/antallOver9;

        int total3 = 0;

        for(int i : heltall){
            total3 += i;
        }

        System.out.println("Total i array: " + total);
        System.out.println("Gjennomsnitt av arrayet: " + gjennomsnitt);
        System.out.println("Sum av tall større enn 9: " + total2);
        System.out.println("Gjennomsnittet av tall større enn 9: " + gjennomsnitt2);
        System.out.println("Summen av tallene regnet ut med for each: " + total3);
    }
}
