package service;

import com.videosharing.entity.Video;
import com.videosharing.repository.VideoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoService {

    private final VideoRepository videoRepository;

    public List<Video> findAll(){
        return videoRepository.findAll();
    }
    // Service methods for video operations
}

