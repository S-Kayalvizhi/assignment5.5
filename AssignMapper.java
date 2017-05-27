import java.io.IOException;
	
	import org.apache.hadoop.io.IntWritable;
	import org.apache.hadoop.io.LongWritable;
	import org.apache.hadoop.io.Text;
	import org.apache.hadoop.mapreduce.*;
	
	
	public class AssignMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
	Text outKey=new Text();
	IntWritable one=new IntWritable(1);
	
	public void map(LongWritable key, Text value, Context context)
	throws IOException, InterruptedException {
	outKey.set(value);
	context.write(outKey,one);
	
	
	}
}
