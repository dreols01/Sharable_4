from pyspark.sql.types import StructType, StructField, DateType, DoubleType, StringType

Facility_to_FIPS_schema = StructType([StructField('State', StringType(), True),
            StructField('Facility ID', StringType(), True),
            StructField('County Name', StringType(), True),
            StructField('FIPS', StringType(), True)])

Poverty_schema = StructType([StructField('FIPS_code', StringType(), True),
            StructField('PCTPOVALL_2020', DoubleType(), True)])

Timely_schema = StructType([StructField('Facility ID', StringType(), True),
            StructField('Facility Name', StringType(), True),
            StructField('Address', StringType(), True),
            StructField('City', StringType(), True),
            StructField('State', StringType(), True),
            StructField('ZIP Code', StringType(), True),
            StructField('County Name', StringType(), True),
            StructField('Phone Number', StringType(), True),
            StructField('Condition', StringType(), True),
            StructField('Measure ID', StringType(), True),
            StructField('Measure Name', StringType(), True),
            StructField('Score', StringType(), True),
            StructField('Sample', StringType(), True),
            StructField('Footnote', StringType(), True),
            StructField('Start Date', DateType(), True),
            StructField('End Date', DateType(), True)])

Timely_date_format = "MM/dd/yyyy"