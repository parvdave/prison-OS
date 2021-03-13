import java.util.*;
class File
{
	String Prisoners[][];
	char mode;
	int num;
	File()
	{
		Prisoners = new String[20][2]; // Stores information about prisoners
		mode=' '; //Mode to make sure reading and writing are done separately
		num=0; // Number of prisoners
	}
	void write(String data)
	{
		if(mode=='w')
		{
			Prisoners[num][0]=data.split(" ")[0]; //101 Arham Zaidi
			Prisoners[num][1]=data.split(" ")[1]+" "+data.split(" ")[2];
			num++;
		}
		else
		{
			mode = 'w'
			write(data);
		}
	}
	void read()
	{
		if(mode == 'r')
		{
			for(int i=0;i<num;i++)
			{
				System.out.println(Prisoners[i][0]+" "+Prisoners[i][1]);
			}
		}
		else
		{
			mode = 'r';
			read();
		}
	}
}