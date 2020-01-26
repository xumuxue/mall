package service;
import java.util.List;

import pojo.EasyUIDataGrid;
import pojo.EgoResult;
import pojo.TbItem;
import pojo.TbItemDesc;
import pojo.TbItemParam;

public interface TbItemService {
	EasyUIDataGrid getAllItem(int page,int rows);
	/**
	 * 
	 * @param ids
	 * @param flag 0 Ϊ�߼�ɾ��   1 Ϊʵ��ɾ��
	 * @return
	 */
	//����ɾ��
	EgoResult del(String ids);
	
	int update(String ids,byte status);	
	
	public EgoResult update(TbItem item);
	
	
	int insItem(TbItem item,TbItemDesc desc,TbItemParam itemparams)throws Exception;
	
	List<TbItem> selByStatus(byte i);
	
	TbItem selById(long id);
}
