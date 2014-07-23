package cn.sdut.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.sdut.persistence.dao.interfaces.Lg07Dao;
import cn.sdut.persistence.support.HibernatePageDaoSupport;

public class Lg07DaoImpl extends HibernatePageDaoSupport implements Lg07Dao {

	@Override
	public boolean increase() throws Exception {
		Object args[] = {
			this.getLong("lg0701")
		};
		this.hql = new StringBuilder()
		.append("update Lg07 ")
		.append("   set lg0705 = lg0705+1 ")
		.append(" where lg0705>0 and lg0701=?")
		;
		boolean tag = this.update(hql.toString(), args);
		return tag;
	}
	
	@Override
	public boolean decrease() throws Exception {
		Object args[] = {
			this.getLong("lg0701")
		};
		this.hql = new StringBuilder()
		.append("update Lg07 ")
		.append("   set lg0705 = lg0705-1 ")
		.append(" where lg0705>0 and lg0701=?")
		;
		boolean tag = this.update(hql.toString(), args);
		return tag;
	}
	
	@Override
	public Map getInstance() throws Exception {
		this.hql = new StringBuilder()
		.append("select new map(x.lg0701 as lg0701,x.lg03.lg2101 as lg0301,")
		.append("       x.lg0702 as lg0702, x.lg0703 as lg0703,")
		.append("       x.lg0704 as lg0704, x.lg0705 as lg0705,")
		.append("       x.lg0706 as lg0706, x.lg0707 as lg0707,")
		.append("       to_char(x.lg0708,'YYYY-MM-DD') as lg0708, to_char(x.lg0709,'YYYY-MM-DD') as lg0709,")
		.append("       to_char(x.lg0710,'YYYY-MM-DD') as lg0710, b.fvalue as cnlg0707")
		.append("       )")
		.append("  from Lg07 x, Syscode b")
		.append(" where x.lg0701=?")
		.append("   and x.lg0707=b.fcode")
        .append("   and b.fname='LG0707'");
		return this.queryForMap("lg0701");
	}
	
	@Override
	public List queryForPage() throws Exception {
		Object lg0701 = this.dto.get("lg0701");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0701 as lg0701,x.lg03.lg2101 as lg0301,")
		.append("       x.lg0702 as lg0702, x.lg0703 as lg0703,")
		.append("       x.lg0704 as lg0704, x.lg0705 as lg0705,")
		.append("       x.lg0706 as lg0706, x.lg0707 as lg0707,")
		.append("       to_char(x.lg0708,'YYYY-MM-DD') as lg0708, to_char(x.lg0709,'YYYY-MM-DD') as lg0709,")
		.append("       to_char(x.lg0710,'YYYY-MM-DD') as lg0710, b.fvalue as cnlg0707")
		.append("       )")
		.append("  from Lg07 x, Syscode b")
		.append(" where 1=1")
		.append("   and x.lg0707=b.fcode")
        .append("   and b.fname='LG0707'")
		.append(" order by x.lg0701");
		return this.queryForList();
	}

	@Override
	public boolean add() throws Exception {

		return false;
	}

	@Override
	public List query() throws Exception {
		Object lg0701 = this.dto.get("lg0701");
		this.pars = new ArrayList();
		this.hql = new StringBuilder()
		.append("select new map(x.lg0701 as lg0701,x.lg03.lg2101 as lg0301,")
		.append("       x.lg0702 as lg0702, x.lg0703 as lg0703,")
		.append("       x.lg0704 as lg0704, x.lg0705 as lg0705,")
		.append("       x.lg0706 as lg0706, x.lg0707 as lg0707,")
		.append("       x.lg0708 as lg0708, x.lg0709 as lg0709,")
		.append("       x.lg0710 as lg0710")
		.append("       )")
		.append("  from Lg07 x")
		.append(" where 1=1");
		if (checkVal(lg0701)) {
			this.hql.append(" and x.lg0701=?");
			this.pars.add(Long.parseLong(lg0701.toString()));
		}
		return this.queryForList();
	}

	@Override
	public boolean modify() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete() throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
