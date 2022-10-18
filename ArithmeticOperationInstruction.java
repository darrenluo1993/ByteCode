public class ArithmeticOperationInstruction {
    public static void main(String[] args) {
        int int1 = 12;
	int int2 = 23;
	int sum = int1 + int2;
	int sub = int1 - int2;
	int mul = int1 * int2;
	int div = int1 / int2;
	int rem = int1 % int2;
	int neg = -(int1);

	float float1 = 1.234f;
	float float2 = 2.345f;
	float sum1 = float1 + float2;
	float sub1 = float1 - float2;
	float mul1 = float1 * float2;
	float dev1 = float1 / float2;
	float rem1 = float1 % float2;
	float neg1 = -(float1);

	long long1 = (long) int1;
	float float3 = (float) int1;
	double double1 = (double) int1;
	byte byte1 = (byte) int1;
	char char1 = (char) int1;
	short short1 = (short) int1;

	int int3 = (int) long1;
	float float4 = (float) long1;
	double double2 = (double) long1;

	int int4 = (int) float3;
	long long2 = (long) float3;
	double double3 = (double) float3;

	int int5 = (int) double1;
	long long3 = (long) double1;
	float float5 = (float) double1;
    }
}
