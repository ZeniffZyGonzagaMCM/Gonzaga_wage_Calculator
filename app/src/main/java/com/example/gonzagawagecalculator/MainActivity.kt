<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity"
android:orientation="vertical"
android:gravity="center">


<LinearLayout
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:gravity="center"
>

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginBottom="30dp"
android:gravity="center"
android:text="@string/emptitle"
android:textSize="25sp"
android:textStyle="bold"
android:textColor="@color/colorAccent"
/>

<ImageView
android:layout_width="200sp"
android:layout_height="100sp"
android:gravity="center"
android:src="@drawable/payroll"
/>
<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal"
android:gravity="center">

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginLeft="20sp"
android:text="@string/empname"
android:textColor="@color/colorPrimary"
/>

<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:id="@+id/empname"
android:textColor="@color/colorAccent"
android:gravity="center"

/>

</LinearLayout>


<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal"
android:gravity="center">

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginLeft="20sp"
android:text="@string/empsalary"
android:textColor="@color/colorPrimary"
/>

<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:id="@+id/empsal"
android:textColor="@color/colorAccent"
android:gravity="center"
/>

</LinearLayout>

<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal"
android:gravity="center">

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginLeft="20sp"
android:text="@string/emptax"
android:textColor="@color/colorPrimary"
/>

<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:id="@+id/emptax"
android:textColor="@color/colorAccent"
android:gravity="center"

/>

</LinearLayout>


<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal"
android:gravity="center">

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginLeft="20sp"
android:text="@string/netsal"
android:textColor="@color/colorPrimary"
/>

<EditText
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:id="@+id/netsal"
android:textColor="@color/colorAccent"
android:gravity="center"

/>

</LinearLayout>


<LinearLayout
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:orientation="horizontal"
android:gravity="center">

<Button
android:id="@+id/btn1"
android:layout_width="wrap_content"
android:layout_height="wrap_content"

android:text="@string/ok" />


<Button
android:id="@+id/btn2"
android:layout_width="wrap_content"
android:layout_height="wrap_content"

android:text="@string/cancel" />

</LinearLayout>

</LinearLayout>
</LinearLayout>