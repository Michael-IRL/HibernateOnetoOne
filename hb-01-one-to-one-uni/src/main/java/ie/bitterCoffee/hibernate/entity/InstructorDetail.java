package ie.bitterCoffee.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail
{
	//annotate the class as entity and map to the db table
	
	//define the fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int id;
	
	@Column(name="youtube_channel")
	String youtubeChannel;
	
	@Column(name="hobby")
	String hobby;
	
	@OneToOne(mappedBy="instructorDetail",cascade=CascadeType.ALL)
	private Instructor instructor;
	
	//create the constructors
	public InstructorDetail()
	{
		
	}

	public InstructorDetail(String youtubeChannel, String hobby)
	{
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getYoutubeChannel()
	{
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel)
	{
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby()
	{
		return hobby;
	}

	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}

	public Instructor getInstructor()
	{
		return instructor;
	}

	public void setInstructor(Instructor instructor)
	{
		this.instructor = instructor;
	}

		
	
	//generate getters/setter
	
	//generte toString()
}
