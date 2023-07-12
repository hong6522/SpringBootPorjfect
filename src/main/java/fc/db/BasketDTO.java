package fc.db;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("bDTO")
@Data
public class BasketDTO {
	
	String id ,proName , color , size , cate , address , bundle;
	int price , totalPrice , cnt ,pno;
	Integer num;
}
