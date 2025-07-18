public class Sample {
    public static void main(String[] args) {
/*int academic_percet;
int il score
int work experience
int is paper
int backlogs

85> 7.5> 1or2 - admission 
75-84 7> 0 - please publish one paper
70 7 back -please clear 
60 6 5-exp -ar
ticles publish */
        int a;
        int day=0;
        final int ilScore=7;
        int academicpercentage=75;
        boolean backlogs=true;
        boolean papersPublished=true;
        int experience=5;



     switch (day) {
        case 0:
        a=3;
        System.out.println("M");
            
            break;
        case 1:System.out.println("T");
            
            break;
        case 2:System.out.println("W");            
            break;
            
        case 3:System.out.println("Th");
            
            break;
        case 4:System.out.println("F");
            
            break;
        case 5:System.out.println("Sa");
            
            break;
         case 6:System.out.println("su");
            
            break;
        default:
            break;
     }
     System.out.println(a);



        if(ilScore>7.5&&experience>0&&papersPublished){
            System.out.println("Admission");
        }
        if(experience>0&&academicpercentage>=65&&(papersPublished==false)){
            System.out.println("Publsih");

        }
        if(experience==5&&academicpercentage>=60&&ilScore>=6){
            System.out.println("Publsih");

        }


    
    }
}
