public class Switch {
    public static void main(String[] args) {
        // int n = 1;
        // switch(n)
        // {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid number");
        // }

        //New Type Switch
        String day = "Saturday";
        // switch (day) {
        //     case "Saturday", "Sunday":
        //         System.out.println("6am");
        //         break;
        //     case "Monday":
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("7am");
        // }

        // switch (day) {
        //     case "Saturday", "Sunday" -> System.out.println("6am");
        //     case "Monday" -> System.out.println("8am");
        //     default -> System.out.println("7am");
        // }

        // String result = "";
        // result = switch (day) {
        //     case "Saturday", "Sunday" -> "6am";
        //     case "Monday" -> "8am";
        //     default -> "7am";
        // };
        // System.out.println(result);

        String result = "";
        result = switch (day) {
            case "Saturday", "Sunday" : yield "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };
        System.out.println(result);
    }
}
