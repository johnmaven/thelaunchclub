package com.launchclub;


	import org.apache.hadoop.conf.Configuration;
	import org.apache.hadoop.hbase.HBaseConfiguration;
	import org.apache.hadoop.hbase.HColumnDescriptor;
	import org.apache.hadoop.hbase.HTableDescriptor;
	
	import org.apache.hadoop.hbase.client.Admin;
	import org.apache.hadoop.hbase.client.Connection;
	import org.apache.hadoop.hbase.client.ConnectionFactory;
	import org.apache.hadoop.hbase.client.TableDescriptor;
 public class HBaseAdmin {

	    public static void main(String[] args) {
	        Configuration conf = HBaseConfiguration.create();
	        try {           
	            Connection conn = ConnectionFactory.createConnection(conf);
	            Admin hAdmin = conn.getAdmin();

	            HTableDescriptor htable = new HTableDescriptor("User");
	            htable .addFamily(new HColumnDescriptor("Name"));
	            htable .addFamily(new HColumnDescriptor("Address"));
	            htable .addFamily(new HColumnDescriptor("Email"));
	            htable .addFamily(new HColumnDescriptor("Password"));
	            htable .addFamily(new HColumnDescriptor("PhoneNumber"));
	            System.out.println( "Creating Table..." );
	         hAdmin.createTable( (TableDescriptor) htable);
	            System.out.println("Done!");

	            System.out.println("Table created Successfully...");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
