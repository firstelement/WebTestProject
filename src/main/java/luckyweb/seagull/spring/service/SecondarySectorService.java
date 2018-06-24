package luckyweb.seagull.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import luckyweb.seagull.spring.entity.SecondarySector;

/**
 * =================================================================
 * 这是一个受限制的自由软件！您不能在任何未经允许的前提下对程序代码进行修改和用于商业用途；也不允许对程序代码修改后以任何形式任何目的的再发布。
 * 为了尊重作者的劳动成果，LuckyFrame关键版权信息严禁篡改
 * 有任何疑问欢迎联系作者讨论。 QQ:1573584944  seagull1985
 * =================================================================
 * 
 * @author seagull
 */
@Transactional(rollbackFor = Exception.class)
public interface SecondarySectorService {
	/**
	 * 增加部门
	 * @param sector
	 * @return
	 * @throws Exception
	 */
	public int add(SecondarySector sector)throws Exception;
	/**
	 * 修改部门
	 * @param sector
	 * @throws Exception
	 */
	public void modify(SecondarySector sector)throws Exception;

	/**
	 * 删除部门
	 * @param sector
	 * @throws Exception
	 */
	public void delete(SecondarySector sector)throws Exception;
	/**
	 * 获取部门列表
	 * @param sector
	 * @return
	 * @throws Exception
	 */
	public List<SecondarySector> list(SecondarySector sector)throws Exception;
	/**
	 * 获取部门列表
	 * @return
	 * @throws Exception
	 */
	public List<SecondarySector> listall()throws Exception;

	/**
	 * 获取部门实体
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public SecondarySector load(int id)throws Exception;

	/**
	 * 部门分页
	 * @param value
	 * @param offset
	 * @param pageSize
	 * @return
	 */
	public List findByPage( final Object value,final int offset, final int pageSize);
	/**
	 * 部门分页条数
	 * @param sector
	 * @return
	 */
	public int findRows(SecondarySector sector) ;

	/**
	 * 获取部门列表
	 * @return
	 * @throws Exception
	 */
	public List<SecondarySector> findSecotorList()  throws Exception ;
}
