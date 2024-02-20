package guru.springframework.di.diproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service("dataSource")
public class UATDataSourceServiceImpl implements DataSourceService{
    @Override
    public String getDataSource() {
        return "UAT";
    }
}
