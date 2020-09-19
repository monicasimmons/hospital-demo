package hospital;

public abstract class Administrator extends HospitalEmployee {

        private String department;       //keep specialty - unique property for this class

        public Administrator(String employeeNumber, String name, String department) {
            super(employeeNumber, name);            //super reference means these properties are coming from their parent
            this.department = department;
        }

        @Override                                //overrode abstract method to properly return the right data
        public abstract int calculatePay();         //why don't we need to return anything?
}
