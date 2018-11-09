import java.io.File;
import java.util.TreeSet;

public class wmaFinder 
{
	private String fileNameToSearch;
	private static int count = 0;
	private static	TreeSet<String> al = new TreeSet<String>();
	
	public String getFileNameToSearch() {
		return fileNameToSearch;	
	}
	
	public void setFileNameToSearch(String fileNameToSearch) {
		this.fileNameToSearch = fileNameToSearch;
	}

	public TreeSet<String> getList()
	{
		return al;
	}
	
	public static void main(String[] args) 
	{
		wmaFinder fileSearch = new wmaFinder();
		fileSearch.searchDirectory(new File("G:/Music"));
		
		int c = 1;
		
		for(String s: al)
		{
			System.out.println(c++ + ": " + s);
		}
		
		System.out.println("Number of WMA files: " + count);
		
	}
	
	public void searchDirectory(File directory)
	{
		setFileNameToSearch(fileNameToSearch);
		
		if(directory.isDirectory())
		{
			search(directory);
		}
	}
	
	private void search(File file)
	{
		if(file.isDirectory())
		{
			if(file.canRead())
			{
				for(File temp: file.listFiles())
				{
					if(temp.isDirectory())
					{
						search(temp);
					}
					else if(temp.getName().endsWith(".wma"))
						al.add(file.toString());
						count++;
				}
			}
		}
	}
}
