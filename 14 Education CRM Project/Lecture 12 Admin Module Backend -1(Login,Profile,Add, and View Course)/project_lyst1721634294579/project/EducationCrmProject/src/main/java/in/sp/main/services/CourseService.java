package in.sp.main.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import in.sp.main.entities.Course;
import in.sp.main.repositories.CourseRepository;

@Service
public class CourseService 
{
	private String UPLOAD_DIR = "src/main/resources/static/uploads/";
	private String IMAGE_URL = "http://localhost:8080/uploads/";
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourseDetails()
	{
		return courseRepository.findAll();
	}
	
	public void addCourse(Course course, MultipartFile courseImg) throws IOException
	{
		String imgName = courseImg.getOriginalFilename();
		Path imgPath = Paths.get(UPLOAD_DIR+imgName);
		Files.write(imgPath, courseImg.getBytes());
		
		String imgUrl = IMAGE_URL+imgName;
		course.setImageUrl(imgUrl);
		
		courseRepository.save(course);
	}
}
