interface IJob {
  id?: number;
  name?: string;
  description?: string;
  type?: number;
  clientVersion?: string;
  config?: {
    jarName?: string;
    mainClass?: string;
    args?: string;
    parallelism?: number;
  };
  lastStatus?: string;
  lastAppId?: string;
  lastStartTime?: string;
  lastStopTime?: string;
  createTime?: string;
  updateTime?: string;
}

export { IJob };
