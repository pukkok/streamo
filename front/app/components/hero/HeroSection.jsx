'use client'

import { Swiper, SwiperSlide } from 'swiper/react'
import 'swiper/css'
import 'swiper/css/pagination'
import { Pagination, Autoplay } from 'swiper/modules'
import dummySlides from './dummySlides'
import HeroSlide from './HeroSlide'

const HeroSection = () => {
  return (
    <div className="relative w-full h-[600px] overflow-hidden group">
      <Swiper
        modules={[Pagination, Autoplay]}
        pagination={{ clickable: true }}
        autoplay={{ delay: 3000, pauseOnMouseEnter: true }}
        loop={true}
        slidesPerView={1}
        className="w-full h-full"
      >
        {dummySlides.map((slide) => (
          <SwiperSlide key={slide.id}>
            <HeroSlide {...slide} />
          </SwiperSlide>
        ))}
      </Swiper>

      <style jsx global>{`
        .swiper-pagination-bullet {
          background: rgba(0, 0, 0, 0.7);
          width: 10px;
          height: 10px;
          margin: 0 6px;
          border-radius: 9999px;
        }

        .swiper-pagination-bullet-active {
          background: #ffbb00;
        }
      `}</style>
    </div>
  )
}

export default HeroSection
