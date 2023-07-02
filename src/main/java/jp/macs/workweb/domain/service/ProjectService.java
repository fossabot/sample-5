package jp.macs.workweb.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.macs.workweb.domain.entity.bibleManage.project.Project;
import jp.macs.workweb.domain.entity.bibleManage.project.ProjectCriteria;
import jp.macs.workweb.domain.repository.bibleManage.project.ProjectMapper;
import jp.macs.workweb.ifentity.entity.bibleManage.ProjectInfo;

@Service
@Transactional
public class ProjectService {
	
	@Autowired
	ProjectMapper projectMapper; 

	/**
	 * �Č��ꗗ
	 * @return
	 */
	public List<ProjectInfo> selectAll(){
		ProjectCriteria example= new ProjectCriteria();
		List<Project> projectList = new ArrayList();
		List<ProjectInfo> projectInfoList = new ArrayList();
		projectList=projectMapper.selectByExample(example);
		
		//�v���p�e�B�̃R�s�[�iprojectList��projectInfoList�j
		for(Project project:projectList) {
			ProjectInfo projectInfo=new ProjectInfo();
			BeanUtils.copyProperties(project,projectInfo);
			projectInfoList.add(projectInfo);
		}
		return projectInfoList;
	}
	/**
	 * �Č��擾
	 * @param project_id
	 * @return
	 */
	public ProjectInfo selectOne(String projectId){
		Project project= projectMapper.selectByPrimaryKey(projectId);
		ProjectInfo projectInfo=new ProjectInfo();
		BeanUtils.copyProperties(project, projectInfo);
		return projectInfo;
	}
	/**
	 * �Č��쐬
	 * @param project
	 * @return
	 */
	public int insertProject(ProjectInfo projectInfo){
		Project project= new Project();
		BeanUtils.copyProperties(projectInfo, project);
		return projectMapper.insertSelective(project);
	}
	/**
	 * �X�V
	 * @param project
	 * @return
	 */
	public int updateProject(Project project){
		return projectMapper.updateByPrimaryKeySelective(project);
	}
	/**
	 * �폜
	 * @param project_id
	 * @return
	 */
	public int deleteProject(String projectId){
		return projectMapper.deleteByPrimaryKey(projectId);
	}
	
}
