
package bai1;

import java.time.*;
import java.util.*;
class NhanVien{
    private String name,snhat,ngayk,gtinh,dchi,so;
    private Integer id;

    public NhanVien( Integer id, String name, String gtinh, String snhat,  String dchi, String so , String ngayk) {
        this.name = name;
        this.snhat = snhat;
        this.ngayk = ngayk;
        this.gtinh = gtinh;
        this.dchi = dchi;
        this.so = so;
        this.id = id;
    }

    public String getId() {
        return String.format("%05d",id);
    }

    public String getSnhat() {
        return snhat;
    }
    
    public LocalDate getSNhat() {
        Integer n,m,y;
        String[] s = getSnhat().trim().split("/");
        n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        y = Integer.parseInt(s[2]);
        LocalDate ngshn,nghn;
        ngshn = LocalDate.of(y,m, n);
        nghn = LocalDate.now();
        Period tuoi = Period.between(ngshn, ngshn);
        return LocalDate.of(y,m,n);
    }
    
    @Override
    public String toString() {
        return getId()+" "+name+" "+gtinh+" "+snhat+" "+dchi+" "+so+" "+ngayk;
        //return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
public class j05007_SapXepDanhSachDoiTuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<NhanVien> nv = new ArrayList<>();
        int t = sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=t;i++){
            
            String  name,gtinh,snhat,dchi,so,ngayg;
            name = sc.nextLine();
            gtinh = sc.nextLine();
            snhat = sc.nextLine();
            dchi = sc.nextLine();
            so = sc.nextLine();
            ngayg = sc.nextLine();
            //NhanVien x =new NhanVien(i,name,gtinh,snhat,dchi,so,ngayg);
            //System.out.println(x);
            nv.add(new NhanVien(i,name,gtinh,snhat,dchi,so,ngayg));
        }
        Collections.sort(nv, new Comparator<NhanVien>(){
            public int compare(NhanVien o1, NhanVien o2){
                int cmp = o1.getSNhat().compareTo(o2.getSNhat());
                if (cmp ==0){
                    return o1.getId().compareTo(o2.getId());
                }
                return cmp;
                
            }
        });
        for(NhanVien x : nv){
            System.out.println(x);
        }
    }
}
