package guru.springframework.di.diproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Qa")
@Service("dataSource")
public class QaDataSourceServiceImpl implements DataSourceService{
    @Override
    public String getDataSource() {
        return "Qa";
    }
}
