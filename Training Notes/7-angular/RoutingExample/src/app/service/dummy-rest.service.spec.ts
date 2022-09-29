import { TestBed } from '@angular/core/testing';

import { DummyRestService } from './dummy-rest.service';

describe('DummyRestService', () => {
  let service: DummyRestService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DummyRestService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
