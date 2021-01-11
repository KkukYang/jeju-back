package boot.jeju.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import boot.jeju.data.SpotreviewDto;

@Mapper
public interface SpotreviewMapper {
	public List<SpotreviewDto> getList(String contentsid);
	public SpotreviewDto getData(String num);
	public void insert(SpotreviewDto dto);
	public void delete(String num);
	public void update(SpotreviewDto dto);
	public int getTotalCount(String contentsid);
	public void updateLikes(String num);
	public int getAvgStar(String contentsid);
}