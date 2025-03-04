public class Auto {
    public String merk = "merk onbekend";
    public String type = "";
    public int pk = 20;

    // empty constructor
    public Auto () {}

    // constructor
    // public Auto(String merk, String type, int pk) {
    //     this.merk = merk;
    //     this.type =type;
    //     this.pk = pk;
    // }

    // setters
    public void setMerk(String merk ) {
       this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }
        
    public void setPk(int pk) {
        this.pk = pk;
    }

    // getters
    public String getMerk() {
        return merk;
    }

    public String getType() {
        return type;
    }
     
    public int getPK() {
        return pk;
    }
    
    public int getMaxVermogen(int pk) {
        return pk - 20;
    }

    public String toString() {
        return merk + " " + type + " (" + pk + "pk, maximaal op te voeren met " + getMaxVermogen(pk) + ")";
    }
    public  void  voerOp(int extraPk) {
        System.out.println(merk + " opvoeren met " + extraPk + " pk");  
        this.pk += extraPk; // hier worden de pk's aangepast
        System.out.println("resultaat: " + this.toString());
    }        
}