package byui.cit360.familiarity.http;

/**
 * Created by Kristin Newill (aingealfire) on 2/22/2019.
 */
public class HttpUser {

    private String sam;
    private String name;
    private String mo;
    private String sn;
    private String gn;
    private String pn;



    public String getSam() {
        return sam;
    }

    public void setSam(String sam) {
        this.sam = sam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMo() {
        return mo;
    }

    public void setMo(String mo) {
        this.mo = mo;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getGn() {
        return gn;
    }

    public void setGn(String gn) {
        this.gn = gn;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }



    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("***** User Details *****\n");
        sb.append("ID: "+getSam()+"\n");
        sb.append("Name: "+getName()+"\n");
        sb.append("Email: "+getPn()+"\n");
        sb.append("Group: "+getMo()+"\n");
        sb.append("*****************************");

        return sb.toString();
    }


}
