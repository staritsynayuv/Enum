import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StatisticsUiHandler {
    private final Scanner in = new Scanner(System.in);
    private final Map<Candidate, List<Voter>> map;

    public StatisticsUiHandler(Map<Candidate, List<Voter>> map) {
        this.map = map;
    }

    public void start(){


            showMenu();
            switch (in.nextInt()) {
                case 1:
                    ststisticByGender();
                    break;
                case 2:
                    ststisticByAge();
                    break;
                default:
                    return;
            }


    }

    private void ststisticByGender() {

        for (Map.Entry<Candidate, List<Voter>> entry : map.entrySet()) {
            int countMale = 0;
            int countFemale = 0;

            for(Voter voter: entry.getValue()) {
                if (voter.getGender() == Gender.MALE) {
                    countMale++;
                } else
                    countFemale++;
            }
            System.out.println(entry.getKey().getFio());
            System.out.println("Male: " + countMale);
            System.out.println("Female: " + countFemale);
        }

    }

    private void ststisticByAge() {
        for (Map.Entry<Candidate, List<Voter>> entry : map.entrySet()) {
            int countYoung = 0;
            int countAverage = 0;
            int countElderly = 0;
            int countSenile = 0;

            for(Voter voter: entry.getValue()) {
                if (voter.getAgeCategory() == AgeCategory.YOUNG) {
                    countYoung++;
                } else if (voter.getAgeCategory() == AgeCategory.AVERAGE) {
                    countAverage++;
                } else if (voter.getAgeCategory() == AgeCategory.ELDERLY) {
                    countElderly++;
                } else if (voter.getAgeCategory() == AgeCategory.SENILE) {
                    countSenile++;
                }
            }
            System.out.println(entry.getKey().getFio());
            System.out.println("Young: " + countYoung);
            System.out.println("Avarage: " + countAverage);
            System.out.println("Elderly: " + countElderly);
            System.out.println("Senile: " + countSenile);
        }

    }

    private void showMenu() {
        System.out.println("Показать статистику: ");
        System.out.println("1. по полу");
        System.out.println("2. по возрасту");
        System.out.println("3. Выход");
        System.out.print(">");
    }
}
