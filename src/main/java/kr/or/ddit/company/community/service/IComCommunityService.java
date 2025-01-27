package kr.or.ddit.company.community.service;

import java.util.List;

import kr.or.ddit.comm.file.vo.AtchFileDetailVO;
import kr.or.ddit.comm.file.vo.AtchFileVO;
import kr.or.ddit.comm.paging.vo.PaginationInfoVO;
import kr.or.ddit.comm.security.vo.EmployeeVO;
import kr.or.ddit.company.community.vo.ComCommunityVO;

public interface IComCommunityService {

	public List<ComCommunityVO> communityCompany(EmployeeVO employeeVO);

	public List<ComCommunityVO> communityInfo(EmployeeVO employeeVO);

	public List<ComCommunityVO> communityFree(EmployeeVO employeeVO);

	public void insertCommunity(ComCommunityVO ComCommunityVO);

	public ComCommunityVO communityDetail(int cmntyNo) throws Exception;

	public void communityModify(ComCommunityVO ComCommunityVO);

	public int removeCommunity(int cmntyNo);

	public String atchFileInsert(AtchFileVO afVO);

	public void deleteAtchFile(AtchFileDetailVO atchFileDetailVO);

	public void updateAtchFile(AtchFileDetailVO atchFileDetailVO);

	public int deleteYAtchFile(String atchFileCd);

	public int deleteNAtchFile(String string);

	public void addAtchFile(AtchFileDetailVO i);

	public int selectCmntyCount(PaginationInfoVO<ComCommunityVO> pagingVO);

	public List<ComCommunityVO> selectCmntyList(PaginationInfoVO<ComCommunityVO> pagingVO);

	public void downloadFile(AtchFileDetailVO atchFileDetailVO);

}
