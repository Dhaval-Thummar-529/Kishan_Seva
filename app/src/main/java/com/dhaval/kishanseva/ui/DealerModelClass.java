package com.dhaval.kishanseva.ui;

public class DealerModelClass {

    String dealeraddress;
    String dealerblock;
    String dealerdealingcrop;
    String dealerdistrict;
    int dealerid;
    long dealerlicence;
    String dealerlicenceby;
    long dealermobile;
    String dealername;

    public DealerModelClass() {

    }

    public DealerModelClass(String dealeraddress, String dealerblock, String dealerdealingcrop, String dealerdistrict, int dealerid, long dealerlicence, String dealerlicenceby, long dealermobile, String dealername) {
        this.dealeraddress = dealeraddress;
        this.dealerblock = dealerblock;
        this.dealerdealingcrop = dealerdealingcrop;
        this.dealerdistrict = dealerdistrict;
        this.dealerid = dealerid;
        this.dealerlicence = dealerlicence;
        this.dealerlicenceby = dealerlicenceby;
        this.dealermobile = dealermobile;
        this.dealername = dealername;
    }

    public String getDealeraddress() {
        return dealeraddress;
    }

    public void setDealeraddress(String dealeraddress) {
        this.dealeraddress = dealeraddress;
    }

    public String getDealerblock() {
        return dealerblock;
    }

    public void setDealerblock(String dealerblock) {
        this.dealerblock = dealerblock;
    }

    public String getDealerdealingcrop() {
        return dealerdealingcrop;
    }

    public void setDealerdealingcrop(String dealerdealingcrop) {
        this.dealerdealingcrop = dealerdealingcrop;
    }

    public String getDealerdistrict() {
        return dealerdistrict;
    }

    public void setDealerdistrict(String dealerdistrict) {
        this.dealerdistrict = dealerdistrict;
    }

    public int getDealerid() {
        return dealerid;
    }

    public void setDealerid(int dealerid) {
        this.dealerid = dealerid;
    }

    public long getDealermobile() {
        return dealermobile;
    }

    public void setDealermobile(long dealermobile) {
        this.dealermobile = dealermobile;
    }

    public String getDealername() {
        return dealername;
    }

    public void setDealername(String dealername) {
        this.dealername = dealername;
    }

    public long getDealerlicence() {
        return dealerlicence;
    }

    public void setDealerlicence(long dealerlicence) {
        this.dealerlicence = dealerlicence;
    }

    public String getDealerlicenceby() {
        return dealerlicenceby;
    }

    public void setDealerlicenceby(String dealerlicenceby) {
        this.dealerlicenceby = dealerlicenceby;
    }
}
