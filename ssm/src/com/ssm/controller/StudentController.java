package com.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.entity.Student;
import com.ssm.serviceimpl.StudentServiceImpl;
import com.ssm.util.Pager;

@Controller
@RequestMapping("StudentController")
public class StudentController {
	
	@Resource
	private StudentServiceImpl studentService;
	
	@RequestMapping("queryStudentInfoByPager")
	public ModelAndView queryStudentInfoByPager(Pager<Student> pager){
		ModelAndView mv = new ModelAndView();
		//�����������ʼ������
		 int beginIndex=0;
		 int endIndex=0;
		 //����ÿҳ��ʾ�������� Ϊ5��
		 pager.setPageSize(5);
		 //�жϣ����ҳ��С��1������Ĭ��ֵ����֮�����¸�ֵ
		 if(pager.getPageIndex()<1)
		 {	
			 beginIndex=1;
			 endIndex=5;
		 }
		 else
		 {
		     beginIndex=(pager.getPageIndex()-1)*pager.getPageSize()+1;
			 endIndex=pager.getPageIndex()*pager.getPageSize();
		 }
		 //��ֵ
		 pager.setPageIndex(beginIndex);
		 pager.setPageSize(endIndex);
		 //������
		 int num=this.studentService.queryTotal();
		 pager.setTotalRecords(num);
		 //��ҳ��
		 pager.setTotalPages();
		 //����ѯ�������ݷ�װ������
		 pager.setList(studentService.queryStudentByPager(beginIndex, endIndex));
		//ͨ��ʵ��ģ�ʹ洢��ǰ��ѯ���϶�������
		mv.addObject("pager", pager);
		mv.setViewName("index");
		return mv;
	}

}
