package bean;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;
import org.primefaces.PrimeFaces;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.file.UploadedFile;
import org.primefaces.shaded.commons.io.FilenameUtils;
import org.primefaces.util.EscapeUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.lowagie.text.pdf.codec.Base64.InputStream;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import javax.inject.Named;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;


@SuppressWarnings("deprecation")
@Component("helloBean")
@ManagedBean
@ViewScoped
public class HelloBean  implements Serializable{ 
     
	private static final long serialVersionUID = 1L;
	private String name;
	private String name1;
    private String surname;
    private String birthday;
    private String phone;
    private String message;
    private String gender;
    private String password;
    private String password1;
    private boolean marriage; 
    private boolean render=false; 
    private boolean render1=false; 
    private boolean render2=false; 
    private boolean render3=false; 
    private boolean render4=false; 
    private boolean render5=false; 
    private String selectedOption;
    private String opinion;
    private String sign;
    private String option;
   
   
   
   public String getSelectedOption() {
       return selectedOption;
   }

   public void setSelectedOption(String selectedOption) {
       this.selectedOption = selectedOption;
   }
   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean getRender() {
        return render;
    }
    public void setRender(boolean render) {
        this.render = render;
    }
    
    public void makeVisible() { 
    	setRender(true);  
    }
    public void makeUnvisible() { 
    	setRender(false);  
    }
    public void makeVisible1() { 
    	setRender1(true);  
    }  
    public void makeVisible2() { 
    	setRender2(true);  
    }
    public void makeVisible3() { 
    	setRender3(true);  
    }
    public void makeVisible4() { 
    	setRender4(true);  
    }
    public void makeVisible5() { 
    	setRender5(true);  
    }
    public void makeUnvisible1() { 
    	setRender1(false);  
    }
    public void makeUnvisible2() { 
    	setRender2(false);  
    }
    public void makeUnvisible3() { 
    	setRender3(false);  
    }
    public void makeUnvisible4() { 
    	setRender4(false);  
    }
    public void makeUnvisible5() { 
    	setRender5(false);  
    }
    
    
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
           
    
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
       
    
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
     
    public String getMessage() {
    	return message;
    }
     
    public void setMessage(String message) {
    	this.message = message;
    }
        
    public String getGender(){
    	return gender;
    }
    public void setGender(String gender){
    	this.gender = gender;
    }
    public boolean getMarriage(){
    	return marriage;
    }
    public void setMarriage(boolean marriage){
    	this.marriage = marriage;
    }
  
    public void showMessage() { 
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bilgileriniz ;", name +"   "+ surname+"   " +password+" "+birthday+"   "+phone + "  "+gender+ "  "+ marriage );
         
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }
    

	public String getOpinion() {
		return opinion;
	}

	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	
    public void test() {
        name = null;
        surname = null;
        password=null;
        sign=null;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
    }

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	
	
	public void showMessageLogin() { 
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome your account, ", name +"   "+ surname);
        FacesMessage message1 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Warning! ","Your Name or Password invalid , ");
        
        if(name1.equals(name) && password1.equals(password)){
        	PrimeFaces.current().dialog().showMessageDynamic(message);
        }
        else{
        	PrimeFaces.current().dialog().showMessageDynamic(message1);
        }     
    }

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}


 
    private String name2;
    private String dept;
    private int age;
    private double salary;
    private static final ArrayList<Employee> employees
       = new ArrayList<Employee>(Arrays.asList(
       new Employee("John", "Marketing", 30,2000.00),
       new Employee("Robert", "Marketing", 35,3000.00),
       new Employee("Mark", "Sales", 25,2500.00),
       new Employee("Chris", "Marketing", 33,2500.00),
       new Employee("Peter", "Customer Care", 20,1500.00),
       new Employee("Oðuzhan", "Software Engineer Intern", 22,1853.00)
    ));	
    
    
    private static final ArrayList<Employee> selected
    = new ArrayList<Employee>();
    private Employee selectedEmp;
    public static ArrayList<Employee> getSelected() {
		return selected;
	}
    public HelloBean(){
    }


    public Employee getSelectedEmp() {
        return selectedEmp;
    }
 
    public void setSelectedEmp(Employee selectedEmp) {
        this.selectedEmp = selectedEmp;
    }    
     
     
    
    
    public ArrayList<Employee> getEmployees() {
       return employees;
    }

    public String addEmployee() {		 
       Employee employee = new Employee(name2,dept,age,salary);
       employees.add(employee);
       return null;
    }

    public String deleteEmployee(Employee employee) {
       employees.remove(employee);		
       return null;
    }

    public String editEmployee(Employee employee) {
       employee.setCanEdit(true);
       return null;
    }

    public String saveEmployees() {
       
       //set "canEdit" of all employees to false 
       
       for (Employee employee : employees) {
          employee.setCanEdit(false);
       }		
       return null;
    }
    
    public String getName2() {
       return name2;
    }

    public void setName2(String name2) {
       this.name2 = name2;
    }

    public String getDept() {
       return dept;
    }

    public void setDept(String dept) {
       this.dept = dept;
    }

    public int getAge() {
       return age;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public double getSalary() {
       return salary;
    }

    public void setSalary(double salary) {
       this.salary = salary;
    }
 

    
    
	

    private UploadedFile file1;
 
    public UploadedFile getFile1() {
        return file1;
    }
 
    public void setFile1(UploadedFile file1) {
        this.file1 = file1;
    }
 
 
    public void upload1() {
        if (file1 != null) {
            FacesMessage message = new FacesMessage("Successful", file1.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
        }
    }
     
     
    public void handleFileUpload1(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage("Successful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage( null, msg);
    }
    
    
    //graphimage için
    private StreamedContent image;
	private Object myFileName;
	
	public Object getMyFileName() {
		return myFileName;
	}

	public void setMyFileName(Object myFileName) {
		this.myFileName = myFileName;
	}


    public void DynamicImageController() {
        image = DefaultStreamedContent.builder()
                    .contentType("image/jpeg")
                    .stream(() -> this.getClass().getResourceAsStream("barcalogo.jpg"))
                    .build();
    }
    public StreamedContent getImage() {
        return this.image;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void controlDatas( ){
 	   this.name="";
 	   this.surname="";
 	   this.birthday="";
 	   this.phone="";
 	   this.message="";
 	   this.gender="";
 	   this.password="";
 	   this.marriage=false;
 	   this.render=false;
 	   this.selectedOption="";
 	   this.opinion="";
 	   this.sign="";
 	   this.option="";
    }

	public boolean isRender1() {
		return render1;
	}

	public void setRender1(boolean render1) {
		this.render1 = render1;
	}

	public boolean isRender2() {
		return render2;
	}

	public void setRender2(boolean render2) {
		this.render2 = render2;
	}

	public boolean isRender3() {
		return render3;
	}

	public void setRender3(boolean render3) {
		this.render3 = render3;
	}

	public boolean isRender4() {
		return render4;
	}

	public void setRender4(boolean render4) {
		this.render4 = render4;
	}

	public boolean isRender5() {
		return render5;
	}

	public void setRender5(boolean render5) {
		this.render5 = render5;
	}

	
	
	

}
