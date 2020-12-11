package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.julyo.latihanretrofit.DataBinderMapperImpl());
  }
}
