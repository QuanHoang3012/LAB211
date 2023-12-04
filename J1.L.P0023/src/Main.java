

public class Main {

    public static void main(String[] args) {
        App app = new App();
       app.test();
        while (true) {
            int choice = app.menu1();
            switch (choice) {
                case 1:
                    app.createStudent();
                    break;
                case 2:
                    app.findAndSort();
                    break;
                case 3:
                    app.updateOrDelete();
                    break;
                case 4:
                    app.reportStudent();
                    break;
                case 5:
                    return;
            }
        }
    }

}
