
package conferencefinallab;
import java.io.Serializable;

public class Conference implements Serializable {
  private String cName ;
  private int cID; 
  private double fee;
  private String[] papersArr;
  private int nbP;
  
  public Conference(String name , int id , double fee , int size) throws InvalidFeeException{ 
     
      cName  = name ;
      cID = id;
      papersArr = new String[size];
      nbP = 0;
      if(fee < 0 || fee > 9999)
      throw new InvalidFeeException();
      else  
      this.fee = fee;
      
      
  }
  public boolean addPaper(String title ) { 
     
      if(nbP < papersArr.length){
         papersArr[nbP++] = title;
      return true;
      }
      else 
      return false;
  }
  
  public String toString() { 
      String str = "Conference" + "| Name : " +cName + " |ID : " +cID+" |Fee :" +fee + " |Number of Papers " + nbP + "\n";
      str = str + "******All Papers ****"+"\n";
      for(int i = 0 ;i < nbP ;i++)
          str = str +papersArr[i];
      return str;
  }
  
  public boolean checkC (Conference c ) { 
       
      if(c!= null && cName.equals(c.cName) && cID == c.cID)
      return true;
      else 
      return false;   
      
  }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String[] getPapersArr() {
        return papersArr;
    }

    public void setPapersArr(String[] papersArr) {
        this.papersArr = papersArr;
    }

    public int getNbP() {
        return nbP;
    }

    public void setNbP(int nbP) {
        this.nbP = nbP;
    }
  
  
  
  
}
