
package fulib.model;

import java.sql.Date;

public class LogLib {
    private String uid;
    private String bookid;
    private Date ngayDat;
    private Date ngayMuon;
    private Date ngayPTra;
    private Date ngayTra;
    private String manv;
    private int logid;

    public LogLib() {
    }

    public LogLib(String uid, String bookid, Date ngayDat, Date ngayMuon, Date ngayPTra, Date ngayTra, String manv, int logid) {
        this.uid = uid;
        this.bookid = bookid;
        this.ngayDat = ngayDat;
        this.ngayMuon = ngayMuon;
        this.ngayPTra = ngayPTra;
        this.ngayTra = ngayTra;
        this.manv = manv;
        this.logid = logid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public Date getNgayPTra() {
        return ngayPTra;
    }

    public void setNgayPTra(Date ngayPTra) {
        this.ngayPTra = ngayPTra;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public int getLogid() {
        return logid;
    }

    public void setLogid(int logid) {
        this.logid = logid;
    }

    @Override
    public String toString() {
        return "LogLib{" + "uid=" + uid + ", bookid=" + bookid + ", ngayDat=" + ngayDat + ", ngayMuon=" + ngayMuon + ", ngayPTra=" + ngayPTra + ", ngayTra=" + ngayTra + ", manv=" + manv + ", logid=" + logid + '}';
    }
    
    
}
