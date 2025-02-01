
        class Studen{
            private int id ;
            private int roll_no;
            private String name;
            Studen(){
                this.id=id;
                this.roll_no=roll_no;
                this.name=name;
            }
            public int getId() {
                return id;
            }
            public int getroll_no(){
                return roll_no;
            }
            public String getName() {
                return name;
            }
            public void setId(int id) {
                this.id = id;
            }
            public void setRoll_no(int roll_no) {
                this.roll_no = roll_no;
            }
            public void setName(String name) {
                this.name = name;
            }

        }

        public class Consgetset {
            public static void main(String[] args) {
                Studen studen = new Studen();
                studen.setId(101);
                studen.setRoll_no(14);
                studen.setName("Saim");
                System.out.println( studen.getId());
                System.out.println( studen.getroll_no());
                System.out.println( studen.getName());

            }
        }

